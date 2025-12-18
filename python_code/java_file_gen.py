import os

def generate_java_files(folder_path="generated_classes", prefix="MyClass", count=10):
    # Create the folder if it doesn't exist
    os.makedirs(folder_path, exist_ok=True)

    for i in range(1, count + 1):
        class_name = f"{prefix}{i}"
        file_name = os.path.join(folder_path, f"{class_name}.java")

        # Dummy content for the Java file
        content = f"""\
package com.gfg_potd.topic.a1_gen;


public class {class_name} {{

    public static void main(String[] args) {{
    
        int[] arr = {{1, 2, 3, 5, 4, 7, 10}};
        
    }}

    public void dummyMethod() {{
        
        
    }}
    
    public int dummyMethod1() {{
        
        return 1;
    }}
}}
"""
        # Write the content to the file
        with open(file_name, "w") as file:
            file.write(content)

        print(f"Created: {file_name}")

if __name__ == "__main__":
    # You can modify these parameters
    generate_java_files(folder_path="a1_gen", prefix="MyClass", count=15)
