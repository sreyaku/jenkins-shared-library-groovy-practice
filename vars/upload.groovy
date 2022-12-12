def call(){
  echo "Uploading the artifact to S3 ..."
  bat '''
  aws s3 cp ${WORKSPACE}/target/*.war s3://devopslearning-jenkinsharedlibrary
  '''
}
