<!-- PageExternalData.vue -->
<template>
  <div>
    <h2>목록조회 API</h2>
    <div>
    <TuiGrid :data="externalData" ref="TuiGrid" />
    </div>
  </div>
</template>

<script>
import TuiGrid from "@/components/TuiGrid.vue";
import "tui-grid/dist/tui-grid.css";

export default {
  data() {
    return {
      externalData: [],
    };
  },
  components: {
    TuiGrid,
  },
  mounted() {
    this.getExternalData();
  },
  methods: {
    getExternalData() {
      this.$axios
          .get("http://localhost:8081/api/external-data")
          .then((response) => {
            console.log(response)
            console.log(response.data)
            this.externalData = response.data;
            console.log(response);
            if (this.$refs.TuiGrid) {
              this.$refs.TuiGrid.initializeGrid(this.externalData);
            }
          })
          .catch((error) => {
            console.log(error);
            console.error("Error fetching external data:", error);
          });
    },
  },

  watch: {
    externalData: {
      immediate: true,
      handler(newData) {
        if (this.$refs.tuiGrid) {
          this.$refs.tuiGrid.initializeGrid(newData);
        }
      },
    },
  },
};
</script>

<style scoped>
</style>
