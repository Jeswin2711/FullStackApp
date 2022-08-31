import React from "react";
import ProductService from "../Service/ProductService";

class ProductComponent extends React.Component
{
    constructor(props)
    {
        super(props)
        this.state = {
            products : []
        }
    }

    componentDidMount()
    {
        ProductService.getProducts()
        .then((response) => {
            this.setState({
                products : response.data
            })
        })
        console.log(this.state.products)
    }

    render()
    {
        return(
            <div>
                <h1>Products List</h1>
                <table className="table table-bordered">
                    <thead>
                        <tr>
                        <td>Product ID</td>
                        <td>Product Name</td>
                        <td>Product Description</td>
                        <td>Product Price</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.products.map
                            (
                                product => 
                                <tr key={product.id}>
                                    <td>{product.id}</td>
                                    <td>{product.name}</td>
                                    <td>{product.description}</td>
                                    <td>{product.price}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
        
    }
}

export default ProductComponent;