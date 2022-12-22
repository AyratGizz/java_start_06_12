package Seminar_5;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Find_Duplicate_File_in_System_609 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<List<String>> findDuplicate(String[] paths) {
            List<List<String>> ans = new ArrayList<>();
            Map<String, List<String>> contentToFilePaths = new HashMap<>();

            for (String path : paths) {
                String[] words = path.split(" ");
                String rootPath = words[0];
                for (int i = 1; i < words.length; ++i) {
                    String fileAndContent = words[i];
                    int l = fileAndContent.indexOf('(');
                    int r = fileAndContent.indexOf(')');
                    String file = fileAndContent.substring(0, l);
                    String content = fileAndContent.substring(l + 1, r);
                    String filePath = rootPath + '/' + file;
                    contentToFilePaths.putIfAbsent(content, new ArrayList<>());
                    contentToFilePaths.get(content).add(filePath);
                }
            }

            for (List<String> filePaths : contentToFilePaths.values()) {
                if (filePaths.size() > 1)
                    ans.add(filePaths);
            }

            return ans;
        }
    }
}
