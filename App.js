import React from 'react';
//import './App.css';
//import ReactDOM from 'react-dom';
class Form1 extends React.Component {
  constructor(props) {
    super(props);
    this.state={
      name:"",
      branch:"",
      phone:"",
      country:"",
      gender:"",
      pincode:"",
      address:"",
      password:null,
      confirmPassword:null
    };
    this.validateForm=this.validateForm.bind(this);
    this.handleNameChange=this.handleNameChange.bind(this);
    this.handleBranchChange=this.handleBranchChange.bind(this);
    this.handlePhoneChange=this.handlePhoneChange.bind(this);
    this.handleCountryChange=this.handleCountryChange.bind(this);
    this.handlePinCodeChange=this.handlePinCodeChange.bind(this);
    this.handleGenderChange=this.handleGenderChange.bind(this);
    this.handleAddressChange=this.handleAddressChange.bind(this);
    this.handlePasswordChange=this.handlePasswordChange.bind(this);
    this.handleConfirmPasswordChange=this.handleConfirmPasswordChange.bind(this);
    //this.handleChange=this.handleChange.bind(this);
  }
  handleNameChange(event)
  {
    this.setState({name:event.target.value})
  }
  handleBranchChange(event)
  {
    this.setState({branch:event.target.value})
  }
  handlePhoneChange(event)
  {
    this.setState({phone:event.target.value})
  }
  handleCountryChange(event)
  {
    this.setState({country:event.target.value})
  }
  handlePinCodeChange(event)
  {
    this.setState({pincode:event.target.value})
  }
  handleGenderChange(event)
  {
    this.setState({gender:event.target.value})
  }
  handleAddressChange(event)
  {
    this.setState({address:event.target.value})
  }
  handlePasswordChange(event)
  {
    this.setState({password:event.target.value})
  }
  handleConfirmPasswordChange(event)
  {
    this.setState({confirmPassword:event.target.value})
  }
  // handleChange(event) {
  // // let nam=event.target.name;
  // // let bran=event.target.branch;
  // // let ph=event.target.phone;
  // // let count=event.target.country;
  // // let gen=event.target.gender;
  // // let pin=event.target.pincode;
  // // let add=event.target.address;
  // // let pass=event.target.password;
  // // let conf=event.target.confirmPassword;
  // }
  // handleChange(event) {
  //   this.setState({value: event.target.value});
  // }
  validateForm(event)
{
  event.preventDefault();
  // const inputs = event.target.getElementsByTagName('input');
  // this.setState({
  //   name:inputs.name.value,
  //   branch:inputs.branch.value,
  //   phone:inputs.phone.value,
  //   country:inputs.phone.value,
  //   gender:inputs.gender.value,
  //   pincode:inputs.pincode.value,
  //   address:inputs.address.value,
  //   password:inputs.password.value,
  //   confirmPassword:inputs.confirmPassword.value
  // });
  if(this.state.password!==this.state.confirmPassword)
  {
    alert("passwords dont match");
  }
  else
  alert("name: " + this.state.name + "\nbranch: " + this.state.branch + "\nphone: " + this.state.phone + "\ncountry: " + this.state.country + "\ngender: " + this.state.gender + "\naddress: " + this.state.address);
} 
  render()
  {
   return (
     <html>
             <form name="myform" align="center" onSubmit= {this.validateForm}  >
               <label>
                 Name:
         <input type="text" name="name" align="center"value={this.state.name} onChange={this.handleNameChange}  />
               </label>
               <br>
               </br>
               &nbsp;&nbsp;
               <label>
                 Branch:
         <input type="text" name="branch" align="center"value={this.state.branch} onChange={this.handleBranchChange}  />
               </label>
               <br>
               </br>
               <label>
                 Ph.no:
        <input type="text" name="phone" maxlength="10" align="center"value={this.state.phone} onChange={this.handlePhoneChange} />
               </label>
               <br>
               </br>
               &nbsp;&nbsp;
                 <label>
                Country:
                 <select align="center"value={this.state.country} onChange={this.handleCountryChange}>
                   <option  >India</option>
                   <option  >USA</option>
                 <option  >Australia</option>
                   <option  >France</option>
                 </select>
               </label>
               <br></br>
               <label align="center" value={this.state.gender} onChange={this.handleGenderChange}>
           Gender:
                 <input type="radio" align="center"name="gender" value="male"  />Male
                 
                 <input type="radio" name="gender" value="female "align="center" />Female
                 </label>
                 <br>
               </br>
               &nbsp;&nbsp;
                 <label>
                 PinCode:
               <input type="text" name="pincode" maxlength="6" align="center" value={this.state.pincode} onChange={this.handlePinCodeChange}/>
               </label>
               <br></br>
               <label>
                 Address:
        <input type="text" name="address"  value={this.state.address} align="center"onChange={this.handleAddressChange}/>
               </label>
               <br></br>
               <label>
                Password:
         <input type="password" name="password"align="center"value={this.state.password} onChange={this.handlePasswordChange}  />
           </label>
           <br>
               </br>
               &nbsp;&nbsp;
                 <label>
                 Confirm Password:
         <input type="password" name="confirmPassword" align="center" value={this.state.confirmPassword} onChange={this.handleConfirmPasswordChange}/>
               </label>
               <br></br>
               <input onClick="location.href='youtube.com'" align="center"type="submit" as="button" value="submit" class ="btn btn-primary"  />
             </form>
             </html>   
   );
}
}
export default Form1;