variable "region" {
  description = "The AWS region to deploy resources"
  type        = string
  default     = "us-east-1"
}

variable "lambda_runtime" {
  description = "The runtime environment for the Lambda function"
  type        = string
  default     = "python3.8"
}

variable "lambda_role" {
  description = "IAM Role ARN for Lambda function execution"
  type        = string
}

variable "s3_bucket_name" {
  description = "S3 Bucket for storing Lambda code"
  type        = string
}
