<template>
  <div ref="TuiGrid"></div>
</template>

<script>
import "tui-grid/dist/tui-grid.css";
import "tui-pagination/dist/tui-pagination.css"
import Grid from "tui-grid";

export default {
  name: "TuiGrid",
  props: {
    data: {
      type: [Array, Object],
      required: true,
    },
  },

  methods: {
    initializeGrid(data) {
      this.$nextTick(() => {
        if (this.$refs.TuiGrid && !this.gridInstance) {
          const gridOption = {
            el: this.$refs.TuiGrid,
            data: data,
            columns: [
              {
                header: "No.",
                name: "id",
                sortable: true,
                sortingType: 'desc',
              },
              {
                header: "제목",
                name: "title",
                sortable: true,
                sortingType: 'desc',
              },
              {
                header: "작성자",
                name: "name",
                sortable: true,
                sortingType: 'desc',
              },
              {
                header: "댓글수",
                name: "comments",
                sortable: true,
                sortingType: 'desc',
              },
            ],
            pageOptions: {
              useClient: true,
              perPage: 5,
            },
          };
          this.gridInstance = new Grid(gridOption);


          this.gridInstance.on("click", (ev) => {
            const rowKey = ev.rowKey;
            const rowData = ev.instance.store.data.rawData[rowKey];
            console.log(rowData);
            if (ev.columnName === "title" && rowData) {
              this.$router.push(`/api/external-data/${rowData.id}`);
            }
          });
        }
      });
    },
  },
  mounted() {
    this.initializeGrid(this.data);
  },
  beforeUnmount() {
    if (this.gridInstance) {
      this.gridInstance.destroy();
    }
  },
}
</script>

<style scoped>

</style>