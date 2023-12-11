<!--src/views/PageHome.vue-->
<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png" >
    <HelloWorld msg="Spring Boot + VueJS 과제"/>
  </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'PageHome',
  components: {
    HelloWorld
  }
}
</script>

<style scoped>

</style>