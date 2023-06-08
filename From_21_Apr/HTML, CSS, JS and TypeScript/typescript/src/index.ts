let id: number =9;

let company:String ="wiley";

//tuple
let person: [number, String, boolean ]= [1, 'venkat', true];


//tuple array
let employees: [number, String][];

employees = [
    [1, "venkat"],
    [2,"harr"],
    [3,'rab'],
    [4,'kkl']
]


//union
let empId: string | number;

empId= "venkat";

//enum

enum Directions{
    up,
    down,
    left,
    right
}

let currentdirection = Directions.up;

//custom type

type Student = {
    id : number,
    name:String,
    age?:number
}

const studentone: Student={
    id:1,
    name:"bunny"
}
