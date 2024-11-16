provider "aws" {
  region = "us-east-1"
}

resource "aws_lambda_function" "product_lambda" {
  function_name = "ProductLambda"
  runtime = "python3.8"
  role = "arn:aws:iam::123456789012:role/execution_role"
  handler = "index.handler"
  s3_bucket = "my-lambda-functions"
  s3_key = "product-lambda.zip"
}

resource "aws_dynamodb_table" "product_table" {
  name           = "Products"
  billing_mode   = "PAY_PER_REQUEST"
  hash_key       = "id"
  attribute {
    name = "id"
    type = "S"
  }

  attribute {
    name = "name"
    type = "S"
  }
}
