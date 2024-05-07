import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { User } from '../../model/user/user.model';

@Component({
  selector: 'app-users-list',
  templateUrl: './users-list.component.html',
  styleUrl: './users-list.component.css'
})
export class UsersListComponent implements OnInit {

  users: User[];

  constructor(private userServ: UserService){
  }
  ngOnInit(): void {
    this.userServ.findAll().subscribe(data => this.users = data);
  }
}
