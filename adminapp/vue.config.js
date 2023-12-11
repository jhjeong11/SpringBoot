const { defineConfig } = require('@vue/cli-service');

module.exports = defineConfig({
  transpileDependencies: true,
  // outputDir: "../adminapi/src/main/resources/static",
  devServer: {
    proxy: {
      '/': {
        target: 'http://localhost:8081',
        changeOrigin: true,
        ws: false,
        headers: {
          'Max-Forwarded-Size': '4096',
        },
      },
    },
  },


});
