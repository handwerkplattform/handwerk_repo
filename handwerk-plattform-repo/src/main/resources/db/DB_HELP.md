# PostgreSql local configuration

# Step 1

### Login with postgres user
For further reference, please consider the following sections:

* Open terminal or Sql shell
* Use command [ psql -U postgres ];
  if exception try: [ .\psql -U postgres ]

# Step 2

### Create another user and a DB for it

Example:

* [ CREATE USER hw_user_dev WITH ENCRYPTED PASSWORD 'devS3cret'; ](https://www.postgresql.org/docs/8.0/sql-createuser.html)
* [ CREATE DATABASE handwerk_dev WITH OWNER = hw_user_dev; ](https://www.postgresql.org/docs/current/sql-createdatabase.html)

# Step 3

### Check if the new DB appeared

* [ \l ](https://hasura.io/blog/top-psql-commands-and-flags-you-need-to-know-postgresql)
