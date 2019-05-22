/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  hiramtodd
 * Created: May 18, 2019
 */

CREATE TABLE employee(
    id INT NOT NULL auto_increment,
    first_name  VARCHAR(20) default NULL,
    last_name   VARCHAR(20) default NULL,
    salary      INT         default NULL,
    PRIMARY KEY (id)
);