import React from 'react';
import Button from "./components/Button";
import Navbar from "./components/Navbar";
import DropDown from './components/DropDown';




const App = () => (
  <div class="container-fluid">
      <div class="row">
        <div class="row mx-2">
          <Button>Primary</Button>
          <Button color={'secondary'} >Secondary </Button>
          <Button color={'warning'}> Warning</Button>
          <Button color={'success'}> Success</Button>
          <Button color={'danger'}> Danger</Button>
          <Button color={'info'}> Info</Button>
          <Button color={'dark'}> Dark</Button>
          <Button color={'light'}> Light</Button>
          <p class="float-right">

          </p>
        </div>
        <div class="row mx-2">
          <Button>Primary</Button>
          <Button color={'secondary'}  disabled>Secondary </Button>
          <Button color={'warning'} disabled> Warning</Button>
          <Button color={'success'} disabled> Success</Button>
          <Button color={'danger'} disabled> Danger</Button>
          <Button color={'info'} disabled> Info</Button>
          <Button color={'dark'} disabled> Dark</Button>
          <Button color={'light'} disabled> Light</Button>
        </div>
        <div class="row mx-2">
          <Button color={'outline-primary'}>Primary</Button>
          <Button color={'outline-secondary'} >Secondary </Button>
          <Button color={'outline-warning'}> Warning</Button>
          <Button color={'outline-success'}> Success</Button>
          <Button color={'outline-danger'}> Danger</Button>
          <Button color={'outline-info'}> Info</Button>
          <Button color={'outline-dark'}> Dark</Button>
          <Button color={'outline-light'}> Light</Button>
        </div>
        <div class="row mx-2">
          <DropDown>Primary</DropDown>
          <DropDown color={"success"}>Success</DropDown>
          <DropDown color={"info"}>Info</DropDown>
          <DropDown color={"danger"}>Danger</DropDown>

        </div>
        <div class="row">
          <Button color={"primary"} size={"btn-lg"} >Large Button</Button>
          <Button color={"primary"} >Medium Button</Button>
          <Button color={"primary"} size={"btn-sm"} >Small Button</Button>
        </div>
        <Navbar></Navbar>
      </div>
  </div>
);

export default App;
