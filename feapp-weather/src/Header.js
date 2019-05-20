import React from 'react';
import logo from './logo.svg';
import Navigation from './Navigation'

const Header = (props) => {
  const { city } = props;
  return (
    <div>
    <Navigation>
    </Navigation>
    <header className="App-header">
    <img src={logo} className="App-logo" alt="logo" />
    <p>
    여기는 {city} 입니다.
    </p>
    <a className="app-link" href="https://reactjs.org" target="_blank" rel="noopener noreferrer">
    </a>
    </header>
    </div>
  )
}
export default Header;
