provider "aws" {

access_key = var.aws_access_key

secret_key = var.aws_secret_key

region = var.aws_region

}

resource "random_id" "tf_bucket_id" {

byte_length = 2

count = "${var.number_of_instances}"

}

resource "aws_s3_bucket" "tf_code" {

count = "${var.number_of_instances}"

bucket = "${var.project_name}-${random_id.tf_bucket_id.*.dec[count.index]}"

acl = "private"

force_destroy = true

tags = {

Name = "${format("tf_bucket-%d", count.index + 1)}"

}

}
