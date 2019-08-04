<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Essential Links@@@@@!!</h2>
    <button v-on:click="clicked">메시지 클릭</button>
  </div>
</template>

<script>

import api from "./api";

export default {
  name: 'HelloWorld2',
  data () {
    return {
      msg: 'Welcome to Your Vue.jsdd Ap###@@p'
    }
  },
    methods: {
      clicked: function () {
           api.hello().then(
              value => {
                  this.msg = value.data
              }
          )

          this.notify({
              message:
                  "Welcome to <b>Material Dashboard</b> - a beautiful freebie for every web developer.",
              icon: "add_alert",
              horizontalAlign: "top",
              verticalAlign: "left",
              type: "info"
          });

      }
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
