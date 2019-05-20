import React from 'react';

class Weather extends React.Component {
  state = {
    foo: 'bar'
  }

  componentDidMount() {
      console.log('CDM!!');
  }

  render() {
    const foo = this.state.foo;

    return (
      <div>
      <h1>{foo}</h1>
      </div>
    );
  }
}
export default Weather;
