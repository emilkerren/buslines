import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [buses, setBuses] = useState([]);

  useEffect(() => {
    axios.get('/api/buses')
      .then(response => setBuses(response.data.busList))
      .catch(error => console.error(error));
  }, []);

  return (
    <div>
      <h1>List of Buses</h1>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Bus Line</th>
            <th>Number of Bus Stops</th>
            <th>Bus Stops</th>
          </tr>
        </thead>
        <tbody>
          {buses.map(bus =>
            <tr key={bus.id}>
              <td>{bus.id}</td>
              <td>{bus.busNumber}</td>
              <td>{bus.numberOfBusStops}</td>
              <td>{bus.busStops.join(', ')}</td>
            </tr>
          )}
        </tbody>
      </table>
    </div>
  );
}

export default App;