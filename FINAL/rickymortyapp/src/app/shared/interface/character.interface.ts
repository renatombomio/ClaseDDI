export interface Character{
    id:number;
    name:string;
    image: string;
    species: string;
    gender: string;
    created: string;
    status:string;
}

export interface ParamMap {
    keys: string[]
    has(name: string): boolean
    get(name: string): string | null
    getAll(name: string): string[]
  }