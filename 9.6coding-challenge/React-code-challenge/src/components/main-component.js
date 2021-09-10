import { useState } from "react"
import DetailView from "./detail-view";
import axios from "axios"

export default function MainComponent() {

  const [text, setText] = useState(""); 

    const right = {
        position: "absolute",
        left: "500px",
        top: "50px"
      };

    const headingStyle = {
        color: 'red',
        backgroundColor: 'purple'
    }

    const changeText = (id) => {
      console.log(id)
      axios.get('https://jsonplaceholder.typicode.com/todos/' + id)
          .then(response => {
            console.log(response.data.title)
            setText(response.data.title);
          })
          .catch(err=>{
            console.log(".catch"); //code:500 and 400
        })
    }
      
    return (
        <div>
        <div className="App">
          <h1 style={headingStyle}>Click to see more</h1>
          <button onClick= {() => changeText('1')}> first item</button>
          <br/>
          <button onClick= {() => changeText('2')}> second item</button>
          <br/>
          <button onClick= {() => changeText('3')}> Third item</button>
        </div>
  
        <div className="App" style= {right}>
          <DetailView text = {text}></DetailView>
        </div>

      </div>
    )
}
