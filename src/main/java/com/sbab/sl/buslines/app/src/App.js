import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [buses, setBuses] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/buses')
      .then(response => setBuses(response.data.busList))
      .catch(error => console.error(error));
  }, []);

  function renderBusStopRow(busStop, index) {
    return (
      <tr key={index}>
        <td>{index + 1}</td>
        <td>{busStop}</td>
      </tr>
    );
  }

  function renderBusRow(bus) {
    return (
      <React.Fragment key={bus.id}>
        <tr>
          <td>{bus.busNumber}</td>
          <td>{bus.numberOfBusStops}</td>
        </tr>
        <tr>
          <td></td>
          <td></td>
          <td>
            <table>
              <tbody>
                {bus.busStops.map(renderBusStopRow)}
              </tbody>
            </table>
          </td>
        </tr>
      </React.Fragment>
    );
  }

  return (
    <div>
      <h1>List of Buses</h1>
      <table>
        <thead>
          <tr>
            <th>Bus Line ||</th>
            <th>Number of bus stops ||</th>
            <th>Bus Stops</th>
          </tr>
        </thead>
        <tbody>
          {buses.map(renderBusRow)}
        </tbody>
      </table>
    </div>
  );
}

export default App;