<template>
  <div id="app">
    <div id="header">
      <main-header/>
    </div>
    <div id="left">
      <left/>
    </div>
    <img src="./assets/logo.png">
    <router-view/>

    <div id="footer">
      <main-footer/>
    </div>
    <div id="noti">
      <Notifications>ff</Notifications>
    </div>
  </div>
</template>

<script>
import MainHeader from "./components/Header";
import MainFooter from "./components/Footer";
import Left from "./components/Left";


export default {
  name: 'App',
    components: {Left, MainFooter, MainHeader}
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
