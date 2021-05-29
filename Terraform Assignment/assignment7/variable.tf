variable "aws_access_key" { default = ""}

variable "aws_secret_key" {default = ""}

variable "key_name" {default ="MyFirstKey"}

variable "private_key_path" {default = "PATH"}

variable "aws_region" {
  default = "us-east-1"
}

variable "project_name" {
  default = "la-terraform"
}

variable "number_of_instances" {
  default = 2
}
