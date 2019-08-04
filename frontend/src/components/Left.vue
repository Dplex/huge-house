<template>
  <div>
    <div class='left'>
      <ul>
        <li v-for="link in linklist">
          <router-link :to=link.link>{{link.content}}</router-link>
        </li>
      </ul>
    </div>
  </div>
</template>
<script>
    export default {
        name: 'left',
        data () {
            return {
                toggle: this.enter,
                linklist: [
                    {content: "HOME", link:"/"},
                    {content: "MANAGER", link:"/1"}
                ]
            }
        },
        methods: {
            resize: function () {
                $(window).resize(function () {
                    var height = (window.innerHeight / 2) + 'px'
                    $('#left_btn').css({'top': height})
                })
            }
        },
        created () {
            this.resize()
        }
    }
</script>
<style>
  a{color:black}
  a:hover{color:rgb(255,98,124);}
  .left{
    position:fixed;
    top:0px;
    left:0px;
    width:250px;
    height:1000px;
    background:rgba(255,98,124,0.6);
    padding:40px 0;
    overflow: hidden
  }
  .left ul {padding: 0 30px}
  .left ul li { font-size:25px;  height:75px;}
  #left_btn {position:fixed; top:495px; left:-60px; cursor:pointer}
</style>

