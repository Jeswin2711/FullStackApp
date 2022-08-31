import axios from "axios";

const GET_ALL_URL = "http://localhost:1000/product/getall"

class ProductService
{
    getProducts()
    {
        return axios.get(GET_ALL_URL);
    }
}

export default new ProductService()