import os
import calendar

def generate_java_calendar(year):
    # Month names as per calendar module (1–12)
    months = list(calendar.month_name)

    for month_num in range(1, 13):
        month_name = months[month_num]

        # Folder path like: 2026/Jan/
        folder_path = f"year_{year}/mon_{month_num}_{month_name[:3].lower()}"
        os.makedirs(folder_path, exist_ok=True)

        # Get number of days in the month
        days_in_month = calendar.monthrange(year, month_num)[1]

        # Generate daily Java files
        for day in range(1, days_in_month + 1):
            file_name = f"{month_name[:3]}{day}.java"   # e.g., Jan1.java
            file_path = os.path.join(folder_path, file_name)

            # Dummy code
            dummy_code = f"""public class {month_name[:3]}{day} {{

    private int getInt(){{
        
        return 0;
    }}

    private void dummyMethod(){{

    }}
    
    public static void main(String[] args) {{
        System.out.println("This is {month_name[:3]} {day}, {year}");
    }}

}}
"""
            with open(file_path, "w") as f:
                f.write(dummy_code)

    print(f"Java calendar structure for {year} generated successfully!")


# Generate for 2026
generate_java_calendar(2025)




