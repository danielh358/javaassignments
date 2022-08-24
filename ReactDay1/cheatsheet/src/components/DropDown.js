import { useState } from "react";
import Button from "./Button";

    const DropDown = (props) => {
    const color = `btn btn-${props.color || 'primary'}`
    const [isDropDownActive, setDropDownActive] = useState(Boolean(false));
    const show = (isDropDownActive) ? "show" : ""
    function dropDownToggle(){
        setDropDownActive(!isDropDownActive)
    }
  
    return (
        <div classname="btn-group">
            <Button className={props.className || color}>
                {props.children || "Drop-down"}
            </Button>
            <div class="btn-group" role="group">
                <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" >
                
                </button>
                <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
                    <a class="dropdown-item" href="#">Dropdown link</a>
                    <a class="dropdown-item" href="#">Dropdown link</a>
                </div>
            </div>


        </div>
  );
};
export default DropDown;