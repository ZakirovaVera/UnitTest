import unittest

def add(a, b):
    return a + b

class MyTest(unittest.TestCase):
    def test_addition(self):
        result = add(2, 3)
        self.assertEqual(result, 5)

if __name__ == '__main__':
    unittest.main()

# ///////////
# import unittest

# class MyTestCase(unittest.TestCase):
#     def test_addition(self):
#         result = 2 + 2
#         self.assertEqual(result, 4)

#     def test_subtraction(self):
#         result = 5 - 3
#         self.assertNotEqual(result, 0)

#     def test_boolean(self):
#         value = True
#         self.assertTrue(value)

#     def test_none(self):
#         value = None
#         self.assertIsNone(value)

# //////////////
# import unittest

# def add(a, b):
#     return a + b

# class MyTest(unittest.TestCase):
#     def test_addition(self):
#         # Проверка сложения положительных чисел
#         result = add(2, 3)
#         self.assertEqual(result, 5, "Сложение положительных чисел должно давать правильный результат")

#         # Проверка сложения отрицательных чисел
#         result = add(-2, -3)
#         self.assertEqual(result, -5, "Сложение отрицательных чисел должно давать правильный результат")

#         # Проверка сложения положительного и отрицательного числа
#         result = add(2, -3)
#         self.assertEqual(result, -1, "Сложение положительного и отрицательного числа должно давать правильный результат")

# if __name__ == '__main__':
#     unittest.main()
# ///////////////
# import unittest

# # Простой тестовый класс
# class MyTest(unittest.TestCase):
#     def test_addition(self):
#         result = 2 + 3
#         self.assertEqual(result, 5)

#     def test_subtraction(self):
#         result = 5 - 3
#         self.assertEqual(result, 2)

#     def test_multiplication(self):
#         result = 2 * 3
#         self.assertEqual(result, 6)

#     def test_division(self):
#         result = 6 / 2
#         self.assertEqual(result, 3)

#     def test_true_assertion(self):
#         self.assertTrue(True)

#     def test_false_assertion(self):
#         self.assertFalse(False)

#     def test_is_none(self):
#         value = None
#         self.assertIsNone(value)

#     def test_is_not_none(self):
#         value = 42
#         self.assertIsNotNone(value)

#     def test_inclusion_in_list(self):
#         my_list = [1, 2, 3]
#         self.assertIn(2, my_list)

#     def test_not_inclusion_in_list(self):
#         my_list = [1, 2, 3]
#         self.assertNotIn(4, my_list)

#     def test_string_contains(self):
#         string = "Hello, world!"
#         self.assertIn("world", string)

#     def test_string_startswith(self):
#         string = "Hello, world!"
#         self.assertTrue(string.startswith("Hello"))

#     def test_string_endswith(self):
#         string = "Hello, world!"
#         self.assertTrue(string.endswith("!"))

#     def test_exception_raised(self):
#         with self.assertRaises(ValueError):
#             raise ValueError

#     def test_exception_not_raised(self):
#         with self.assertRaises(ValueError):
#             pass

# # Если модуль запускается как основной скрипт, запустить тесты
# if __name__ == '__main__':
#     unittest.main()
# ////////
# import unittest

# def add(a, b):
#     return a + b

# class TestAddition(unittest.TestCase):
#     @unittest.parametrize("input_a, input_b, expected_result", [(2, 3, 5), (5, 7, 12), (0, 0, 0)])
#     def test_addition(self, input_a, input_b, expected_result):
#         result = add(input_a, input_b)
#         self.assertEqual(result, expected_result)

# if __name__ == '__main__':
#     unittest.main()

#     /////pip install pytest


# import pytest

# def add(a, b):
#     return a + b

# @pytest.mark.parametrize("input_a, input_b, expected_result", [(2, 3, 5), (5, 7, 12), (0, 0, 0)])
# def test_addition(input_a, input_b, expected_result):
#     result = add(input_a, input_b)
#     assert result == expected_result

#     ////////////
# import unittest

# def add(a, b):
#     return a + b

# class TestAddition(unittest.TestCase):
#     @unittest.parametrize("input_a, input_b, expected_result", [(2, 3, 5), (5, 7, 12), (0, 0, 0)])
#     def test_addition(self, input_a, input_b, expected_result):
#         result = add(input_a, input_b)
#         self.assertEqual(result, expected_result)

# if __name__ == '__main__':
#     unittest.main()