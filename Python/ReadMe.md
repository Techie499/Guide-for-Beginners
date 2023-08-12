# Python

### For Baics of Python , Visit the following link: https://www.w3schools.com/python/default.asp

## NumPy

In Python, everything is an object, which means that even simple ints are also objects, with all the required machinery to make object work. We call them "Boxed Ints". In contrast, NumPy uses primitive numeric types (floats, ints) which makes storing and computation efficient. NumPy is a Python library used for working with arrays. It also has functions for working in domain of linear algebra, fourier transform, and matrices. 
NumPy was created in 2005 by Travis Oliphant. It is an open source project and you can use it freely. 

### Installation of NumPy

!pip install numpy

### Import NumPy

from numpy import *
or 
import numpy as np

| NumPy Array | Python List |
| --- | --- |
| Fixed Size | Dynamic Size |
| Homogeneous elements | Heterogeneous elements |
| Fast | Slow |
| Less memory | More memory |

### Creating NumPy Arrays

#### 1D Array

arr = np.array([1,2,3,4,5])

#### 2D Array

arr = np.array([[1,2,3,4,5],[6,7,8,9,10]])

#### 3D Array

arr = np.array([[[1,2,3,4,5],[6,7,8,9,10]],[[11,12,13,14,15],[16,17,18,19,20]]])


### NumPy Array Indexing

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr[0] = 1
arr[1] = 2

#### 2D Array

arr = np.array(
        [
            [1,2,3,4,5],
            [6,7,8,9,10]
        ]
    )

arr[0]= [1,2,3,4,5]
arr[0,0] = 1
arr[0,1] = 2

#### 3D Array

arr = np.array(
        [
            [
                [1,2,3,4,5],
                [6,7,8,9,10]
            ],
            [
                [11,12,13,14,15],
                [16,17,18,19,20]
            ]
        ]
    )

arr[0] = [[1,2,3,4,5],[6,7,8,9,10]]
arr[0,0] = [1,2,3,4,5]
arr[0,0,0] = 1

### NumPy Array Slicing

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr[1:5] = [2,3,4,5]
arr[1:] = [2,3,4,5]
arr[:5] = [1,2,3,4,5]
arr[-3:-1] = [3,4]

#### 2D Array

arr = np.array(
        [
            [1,2,3,4,5],
            [6,7,8,9,10]
        ]
    )

arr[1,1:4] = [7,8,9]
arr[0:2,2] = [3,8]
arr[0:2,1:4] = [[2,3,4],[7,8,9]]

#### 3D Array

arr = np.array(
        [
            [
                [1,2,3,4,5],
                [6,7,8,9,10]
            ],
            [
                [11,12,13,14,15],
                [16,17,18,19,20]
            ]
        ]
    )

arr[1,1,1:4] = [17,18,19]
arr[0:2,1,2] = [8,18]
arr[0:2,1,1:4] = [[7,8,9],[17,18,19]]

### NumPy Data Types

| Data Type | Description |
| --- | --- |
| int8 | Integer, 1 byte |
| int16 | Integer, 2 bytes |
| int32 | Integer, 4 bytes |
| int64 | Integer, 8 bytes |
| float16 | Float, 2 bytes |
| float32 | Float, 4 bytes |
| float64 | Float, 8 bytes |
| complex64 | Complex number, represented by two 32-bit floats |
| complex128 | Complex number, represented by two 64-bit floats |
| bool | Boolean, stored as a byte |
| object | Python object type, stored as a pointer |
| S | String type, stored as a byte array |
| U | Unicode string type, stored as a Unicode byte array |

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr.dtype = int32

arr = np.array(
        [1.1,2.1,3.1,4.1,5.1]
    )

arr.dtype = float64

arr = np.array(
        [1,2,3,4,5],
        dtype = 'S'
    )

arr.dtype = S1

np.array(
        [1,2,3,4,5],
        dtype = float
    )

arr.dtype = float64

np.array([{'a':1} ,sys])

arr.dtype = object

### Dimensions and Shape

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr.ndim = 1
arr.shape = (5,)
arr.size = 5

### Replace Items

#### 1D Array

arr = np.array(
        [1,2,3,4,5]
    )

arr[0] = 7
arr[1] = 5

arr # [7,5,3,4,5]

#### 2D Array

arr = np.array(
        [
            [1,2,3],
            [4,5,6],
            [7,8,9]
        ]
    )

arr[1] = np.array([9,9,9])

arr #[
        [1,2,3],
        [9,9,9],
        [7,8,9]
    ]

arr[2] = 88

arr #[
        [1,2,3],
        [9,9,9],
        [88,88,88]
    ]

### Summary Statistics

| Function | Description |
| --- | --- |
| min() | Return the minimum value of the array |
| max() | Return the maximum value of the array |
| mean() | Return the average of the array |
| median() | Return the median of the array |
| sum() | Return the sum of the array |
| std() | Return the standard deviation of the array |
| var() | Return the variance of the array |

a = np.array([1,2,3,4])

a.sum() # 10
