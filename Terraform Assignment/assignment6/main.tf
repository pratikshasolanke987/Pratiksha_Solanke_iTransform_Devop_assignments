provider "aws" {
  access_key = var.aws_access_key
  secret_key = var.aws_secret_key
  region     = var.aws_region
}
 

resource "aws_s3_bucket" "tf_code" {
  bucket = "${var.project_name}-${random_id.tf_bucket_id.dec}"
  acl="private"
  force_destroy = true
  tags = {
         Name = "tf_bucket"
          }

}

resource "random_id" "tf_bucket_id" {
  byte_length =2
}