<template>
  <div>Hello World</div>
  <button @click="registerUser"> ? </button>
</template>

<script>

import axios from '@/http.js'
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  } , 
  methods:{
    registerUser() {
      axios.get('/api/tags').then
    },
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
