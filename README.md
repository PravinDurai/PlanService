# PlanService

# GET : https://p-api-gateway.cfapps.io/benefit/plan
# Header -> Bearer : token
# Used to get the information of all the available plans

# https://p-api-gateway.cfapps.io/benefit/plan/{id}
# Header -> Bearer : token
# Used to fetch only a single plan based on the id in the url path parameter.

# GET : https://p-api-gateway.cfapps.io/benefit/user/{username}/plan
# Header -> Bearer : token
# Used to fetch only a single plan based on the usetname in the url path parameter.

# POST : https://p-api-gateway.cfapps.io/benefit/plan
# Header -> Bearer : token
# It's actually used for creating the plan