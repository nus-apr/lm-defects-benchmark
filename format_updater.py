import json

x = open("meta-data.json")
contents = json.load(x)
x.close()

for entry in contents:
    entry["src"] = {
        "root_abspath": "/experiment/{subject}/{bug_id}/src".format(
            subject=entry["subject"], bug_id=entry["bug_id"]
        ),
        "entrypoint": {
            "file": entry["source_file"]
            if entry.get("language", "_") != "java"
            else (
                (
                    "src/main/java/"
                    if "src/main/java/" not in entry["source_file"]
                    else ""
                )
                + entry["source_file"][:-5].replace(".", "/")
                + ".java"
            ),
            #"function": "main",
        },
    }
    entry["output_dir_abspath"] = "/output"

y = open("meta-data.candidate.json", "w")
json.dump(contents, y)
y.close()
