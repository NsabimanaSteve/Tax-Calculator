gross_monthly_salary = float(input("Enter your gross monthly salary: "))

if gross_monthly_salary < 402:
    net_monthly_salary = gross_monthly_salary
elif gross_monthly_salary < 512.00:
    balance = gross_monthly_salary - 402
    tax_paid_for_first_402 = 0
    remaining_tax = balance * 5 / 100
    total_tax_obligation = tax_paid_for_first_402 + remaining_tax
    net_monthly_salary = gross_monthly_salary - total_tax_obligation
elif gross_monthly_salary < 642.00:
    balance = gross_monthly_salary - 512.00
    tax_paid_for_first_512 = 5.5
    remaining_tax = balance * 10 / 100
    total_tax_obligation = tax_paid_for_first_512 + remaining_tax
    net_monthly_salary = gross_monthly_salary - total_tax_obligation
elif gross_monthly_salary < 3642.00:
    balance = gross_monthly_salary - 642.00
    tax_paid_for_first_642 = 18.5
    remaining_tax = balance * 17.5 / 100
    total_tax_obligation = tax_paid_for_first_642 + remaining_tax
    net_monthly_salary = gross_monthly_salary - total_tax_obligation
elif gross_monthly_salary < 20037.00:
    balance = gross_monthly_salary - 3642.00
    tax_paid_for_first_3642 = 543.5
    remaining_tax = balance * 25 / 100
    total_tax_obligation = tax_paid_for_first_3642 + remaining_tax
    net_monthly_salary = gross_monthly_salary - total_tax_obligation
elif gross_monthly_salary < 50000.00:
    balance = gross_monthly_salary - 20037.00
    tax_paid_for_first_20037 = 4642.25
    remaining_tax = balance * 30 / 100
    total_tax_obligation = tax_paid_for_first_20037 + remaining_tax
    net_monthly_salary = gross_monthly_salary - total_tax_obligation

else:
    if gross_monthly_salary > 50000.00:
        balance = gross_monthly_salary - 50000.00
        tax_paid_for_first_50000 = 13631.15
        remaining_tax = balance * 35 / 100
        total_tax_obligation = tax_paid_for_first_50000 + remaining_tax
        net_monthly_salary = gross_monthly_salary - total_tax_obligation


# Display the result
print(f"Your net monthly salary after tax is: GH¢{net_monthly_salary:.2f}")

