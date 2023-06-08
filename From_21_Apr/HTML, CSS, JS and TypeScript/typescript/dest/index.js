"use strict";
let id = 9;
let company = "wiley";
//tuple
let person = [1, 'venkat', true];
//tuple array
let employees;
employees = [
    [1, "venkat"],
    [2, "harr"],
    [3, 'rab'],
    [4, 'kkl']
];
//union
let empId;
empId = "venkat";
//enum
var Directions;
(function (Directions) {
    Directions[Directions["up"] = 0] = "up";
    Directions[Directions["down"] = 1] = "down";
    Directions[Directions["left"] = 2] = "left";
    Directions[Directions["right"] = 3] = "right";
})(Directions || (Directions = {}));
let currentdirection = Directions.up;
const studentone = {
    id: 1,
    name: "bunny"
};
