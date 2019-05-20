import React from 'react';
import { BrowserRouter } from 'react-router-dom';
import './App.css';
import RouterApp from './RouterApp'

const city = 'YOUR LOCATION';

function App() {
  return (
    <BrowserRouter>
    <RouterApp />
    </BrowserRouter>
  );
};

export default App;
