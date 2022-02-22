<template>
  <div>
    <iframe id="test-iframe" ref="main-iframe" :src="src" ></iframe>
  </div>
</template>

<script>
export default {
  name: "index"

  , computed: {
    src() {
      return "https://baidu.com"
    }
  }
}
</script>

<style scoped>

</style>
