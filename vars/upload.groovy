def call(){
  echo "Uploading the artifact to S3 ..."
  
  bat'''
  aws s3 COPY ${WORKSPACE}/target/*.war arn:aws:s3:::devopslearning-jenkinsharedlibrary
  '''
}
