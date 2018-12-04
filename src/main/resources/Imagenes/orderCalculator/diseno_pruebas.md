

# Las clases de equivalencia y propiedades.

## Clase de equivalencia 
Mirando los casos posibles de que pueden existir en el proyecto $orderCalculator$ solo hemos encontrado dos posibles clases de equivalencia con los errores que posiblemente podrían generarse, ya que las calculadoras no podrían fallar debido a que son cálculos con solo números positivos $( 0 ,$	 Integer.MAX_VALUE $\ ]$
- Orden encontrada.
- Orden no encontrada.

## Propiedades
sea $n$ la orden $n$-th  en la    $class OrdersManager - findOrder$ :

```Java	
	 // Example
	findOrder(int n) { 
		 (n >= orders.size()) // Conjunto de "Order not found"
		 (n< orders.size()) // Conjunto de 'Order found'
	}
```
Igualmente sucede con el metodo $class OrdersManager- calculateOrderTotal$

```Java
	calculateOrderTotal(int n){
		 (n >= orders.size()) // Conjunto de "Order not found"
		 (n< orders.size()) // Conjunto de 'Order found'
	}
```

 # Resultados de Class Pos 
 ## BasicBillCalculator
``` Java
	public int calculatePrice(Order o) {
        int total=0;
        for (Dish p : o.getDishes()){
            total += p.getPrice();
        }
        return total;
    }
```
 
 ```
 Resultado:
	21400
	27500
```


## SpecialRegimeTaxValidator
``` Java
	public double getPercentage(Dish d) {
		return (double) ((d.getType()==DishType.DRINK) ? 0.29 : 0.19);
	}
```

```
Resultado:
	26056
	33225
```
## StandardTaxValidator
``` Java
public double getPercentage(Dish d) {
		return (double) ((d.getType()==DishType.DRINK) ? 0.0 :  0.19);
	}
```

```
Resultado:
	24345
	31775
```
## TipBillCalculator
``` Java
public int calculatePrice(Order o) {
        int total=0;
        for (Dish p : o.getDishes()){
            total += p.getPrice();
        }
        if(total>=15000) {
        	total+= (int)((double)total*0.10);
        }
        return total;
    }
   
  ```
  
```
Resultado:
	23540
	30250
```