# springboot-ecommerce-backend.


monolithic ecommerce application maintaining all the standards.
## Planned ER Diagram for This project
![ER DiaGram](readmeResource/javacom.png) 
## Schema after creating all the entity from ER Diagram
![ER DiaGram](readmeResource/javaCom.jpg)  


## product controller

#### Listing endpoint for product controller

<details>
 <summary><code>GET</code> <code><b>/product</b></code> <code>(gets all the product in json response)</code></summary>

##### Parameters

> None

##### Responses

> | http code     | content-type                      | response    |
> |---------------|-------------|---------------------------------------------------------------------|
> | `200`         | `text/plain;charset=UTF-8`        | JSON object |

##### Example cURL

> ```javascript
>  curl -X GET -H "Content-Type: application/json" http://localhost:8080/
> ```

</details>


<details>
 <summary><code>GET</code> <code><b>/product/{id}</b></code> <code>(gets a single product and its detail in json response)</code></summary>

##### Parameters

> | name |  type     | data type               | description     |
>|------|-----------|-----------|--------------------|
> | id    |  required | JSON object  | N/A  |
##### Responses

> | http code     | content-type                      | response    |
> |---------------|-------------|---------------------------------------------------------------------|
> | `200`         | `text/plain;charset=UTF-8`        | JSON object |

##### Example cURL

> ```javascript
>  curl -X GET -H "Content-Type: application/json" http://localhost:8080/
> ```

</details>



<details>
 <summary><code>POST</code> <code><b>/product</b></code> <code>(Creates Product)</code></summary>

##### Parameters

> | name      |  type     | data type              | description                                                           |
> |-----------|-----------|-------------------------|-----------------------------------------------------------------------|
> | None      |  required | object (JSON)   | N/A  |


##### Responses

> | http code     | content-type                      | response                                                            |
> |---------------|-----------------------------------|---------------------------------------------------------------------|
> | `201`         | `text/plain;charset=UTF-8`        | `Configuration created successfully`                                |
> | `400`         | `application/json`                | `{"code":"400","message":"Bad Request"}`                            |
> | `405`         | `text/html;charset=utf-8`         | None                                                                |

##### Example cURL

> ```javascript
>  curl -X POST -H "Content-Type: application/json" --data @post.json http://localhost:8080/
> ```

</details>



<details>
 <summary><code>PUT</code> <code><b>/product/{id}</b></code> <code>(Updates the product of given id )</code></summary>

##### Parameters

> | name      |  type     | data type               | description                                                           |
> |-----------|-----------|-------------------------|-----------------------------------------------------------------------|
> | None      |  required | object (JSON )   | N/A  |


##### Responses

> | http code     | content-type                      | response                                                            |
> |---------------|-----------------------------------|---------------------------------------------------------------------|
> | `201`         | `text/plain;charset=UTF-8`        | `Configuration created successfully`                                |
> | `400`         | `application/json`                | `{"code":"400","message":"Bad Request"}`                            |
> | `405`         | `text/html;charset=utf-8`         | None                                                                |

##### Example cURL

> ```javascript
>  curl -X POST -H "Content-Type: application/json" --data @post.json http://localhost:8080/
> ```

</details>






<details>
  <summary><code>DELETE</code> <code><b>/product/{id}</b></code> <code>(deletes products with the given id)</code></summary>

##### Parameters

> | name              |  type     | data type      | description            |
> |-------------------|-----------|------------------------|-------------------------------------|
> | `id` |  required | int ($int64)   | The specific product id |


##### Responses

> | http code     | content-type                      | response                                                      |
> |---------------|---------------------------------------------------------------|---------------------------------------------------------------------|
> | `200`         | `text/plain;charset=UTF-8`        | `product <name> was deleted succesfully deleted successfully` |

##### Example cURL

> ```javascript
>  curl -X DELETE -H "Content-Type: application/json" http://localhost:8889/
> ```

</details>


## user controller 
- [ ] user create 
- [ ] user update 
- [ ] user delete
- [ ] user read

## product controller 
- [x] product create
- [ ] product view(single product)
- [x] product delete 
- [x] product update 
- [x] product view with pagination

## cart
- [ ] add to cart
- [ ] remove from cart
- [ ] view cart
## Order  
- [ ] see order 
- [ ] place order
- [ ] update order
- [ ] update status