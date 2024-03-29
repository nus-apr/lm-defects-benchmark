import os
import json

id = 0
result = []

src_dirs_list = ["easy", "medium", "plausible"]

test_file_name = "PublicSolutionTest.java"
main_file_package_path = "com.codex.Solution"
test_file_package_path = "com.codex.PublicSolutionTest"
package_path = os.path.join("com", "codex")
src_test_dir = os.path.join("src", "test", "java")

for subject in src_dirs_list:
    # subject = plausible, easy...

    for bug_id in os.listdir(subject):

        # bug_id = mostFrequent_1, ...., ...

        # src/main/java/com/codex/Solution.java
        # src/test/java/com/codex/PrivateSolutionTest.java
        # src/test/java/com/codex/PublicSolutionTest.java

        f = open(os.path.join(subject, bug_id, src_test_dir, package_path, test_file_name), "r")
        neg_tests = f.read().count("@Test")

        id += 1
        result.append(
            {
                "id": id,
                "subject": subject,
                "bug_id": bug_id,
                "source_file": main_file_package_path,
                "source_directory": "src/main/java/",
                "class_directory": "target/classes/",
                "test_directory": src_test_dir,
                "test_class_directory": "target/test-classes/",
                "line_numbers": [],
                "failing_test_identifiers": [test_file_package_path],
                "passing_test_identifiers": [],
                "dependencies": [],
                "language": "java",
                "count_neg": neg_tests,
                "count_pos": 0,
                "test_file": test_file_name,
                "test_timeout": 5,
            }
        )

root_project = os.getcwd()
os.chdir(root_project)
x = open("meta-data.json", "w")
x.write(json.dumps(result, indent=4))
x.close()
