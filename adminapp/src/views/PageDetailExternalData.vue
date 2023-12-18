
<template>
  <div class="detail-externalData" v-if="rowData">
    <div>
    <h2>상세조회 API</h2>
      <p>No : {{ rowData.id }}</p>
      <p>제목 : {{ rowData.title }}</p>
      <p>작성자 : {{ rowData.name }}</p>
    </div>
<!--    <div>-->
<!--      <comment-form :rowData="rowData"></comment-form>-->
<!--      <comment-list :postId="rowData.id"></comment-list>-->
<!--    </div>-->
  </div>
</template>

<script>
// import CommentForm from "@/store/CommentForm.vue";
// import CommentList from "@/store/CommentList.vue";

export default {
  data() {
    return {
      rowData: null,
    };
  },
  created() {
    this.loadExternalData();
  },
  methods: {
    async loadExternalData() {
      try {
        const id = this.$route.params.id;
        console.log(id);
        const response = await this.$axios.get(`http://localhost:8081/api/external-data/${id}`);
        this.rowData = response.data;
        console.log(response.data);
      } catch (error) {
        console.error("Error fetching external data:", error);
      }
    },
  },
  // components: { CommentForm, CommentList },
};
</script>

<style>
</style>