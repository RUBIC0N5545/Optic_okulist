import { Category } from "../../../Types/Category";
import { Variation } from "../../../Types/Variation";

export interface LiquidGETResponse {
  id: number;
  name: string;
  volume: number;
  price: number;
  description: string;
  identifier: string;
  imageUrl: string;
  imageUrlSecond?: string;
  categories: Category[];
  variations: Variation[];
}
