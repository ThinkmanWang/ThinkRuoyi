<template>
    <div class="wrapper">
      <el-upload
        :action="uploadImgUrl"
        :headers="headers"
        list-type="picture-card"
        :on-preview="handlePictureCardPreview"
        :on-remove="handleRemove">
        <i class="el-icon-plus"></i>
      </el-upload>

      <el-dialog :visible.sync="dialogVisible">
        <img width="100%" :src="dialogImageUrl" alt="">
      </el-dialog>
    </div>
</template>
<style lang="scss" scoped>

</style>

<script>
    import { getToken } from '@/utils/auth'

    export default {
        name: "TestUpload"
        , data() {
            return {
                dialogImageUrl: ''
                , dialogVisible: false
                , uploadImgUrl: process.env.VUE_APP_BASE_API + "/common/upload" // 上传的图片服务器地址
                , headers: {
                    Authorization: 'Bearer ' + getToken()
                }
            }
        }
        , created() {
        }
        , mounted() {
        }
        , beforeDestroy() {
        }
        , watch: {}
        , computed: {}
        , methods: {
            handleRemove(file, fileList) {
                console.log(file, fileList);
            }
            , handlePictureCardPreview(file) {
                this.dialogImageUrl = file.url;
                this.dialogVisible = true;
            }
        }
    }
</script>

