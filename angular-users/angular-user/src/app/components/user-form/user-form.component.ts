import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { User } from '../../model/user/user.model';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrl: './user-form.component.css'
})
export class UserFormComponent{

  user: User;

  constructor(private userServ: UserService, private router: Router, private route: ActivatedRoute){
    this.user = new User();
  }

  onSubmit(){
    this.userServ.save(this.user).subscribe(res => this.redirect());
  }

  redirect(){
    this.router.navigate(['/users']);
  }
}
