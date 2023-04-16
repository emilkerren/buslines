const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class BusList extends React.Component{
	render() {
		const buses = this.props.buses.map(bus =>
			<Bus key={bus._links.self.href} bus={bus}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Busline number</th>
						<th>Number of stops</th>
						<th>Description</th>
					</tr>
					{buses}
				</tbody>
			</table>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)