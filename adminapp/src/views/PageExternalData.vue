<!-- PageExternalData.vue -->
<template>
  <div>
    <h2>목록조회 API</h2>
    <div>
      <div v-if="loading">Loading data...</div>
      <TuiGrid v-if="!loading" :data="externalData" ref="TuiGrid" />
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
      loading: true,
    };
  },
  components: {
    TuiGrid,
  },
  mounted() {
    this.getExternalData();

  },
  methods: {
    async getExternalData() {
      try {
        this.loading = true;

        const response = await this.$axios.get("http://localhost:8081/api/external-data");
        console.log(response.data);

        this.externalData = response.data;

        if (this.$refs.TuiGrid) {
          this.$refs.TuiGrid.initializeGrid(this.externalData);
        }
      } catch (error) {
        console.log(error)
        console.error("Error fetching external data:", error);
      } finally {
        this.loading = false;
      }
    },
  },
};
</script>

<style scoped>
</style>
