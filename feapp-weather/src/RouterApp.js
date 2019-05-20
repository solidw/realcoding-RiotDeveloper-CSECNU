import React from 'react';
import Header from './Header';
import { Route } from 'react-router-dom';
import Weather from './Component/Weather';

const About = () => <div>About</div>

const RouterApp = () => {
  const city = 'Daejeon';

  return (
    <div className="App">
      <Header city = {city}/>
        <Route exact path="/" component={Weather} />
        <Route path="/about" component={About} />
    </div>
  );
};

export default RouterApp;
