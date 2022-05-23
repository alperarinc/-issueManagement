import { NgModule } from '@angular/core';
import { TranslateModule } from '@ngx-translate/core';
import {BsModalRef, ModalModule} from "ngx-bootstrap";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { ConfirmationComponent } from './confirmation/confirmation.component';
import {CommonModule} from "@angular/common";
import { NotFoundComponent } from './not-found/not-found.component';

@NgModule({
  exports:[
    TranslateModule,
    ModalModule,
    ReactiveFormsModule,
    ConfirmationComponent
  ],
  providers:[
    BsModalRef
  ],
  entryComponents:[
    ConfirmationComponent
  ],
  declarations: [
    ConfirmationComponent,

  ],
  imports:[
    ModalModule.forRoot(),
    CommonModule,
    FormsModule,
  ],
})
export class SharedModule { }
