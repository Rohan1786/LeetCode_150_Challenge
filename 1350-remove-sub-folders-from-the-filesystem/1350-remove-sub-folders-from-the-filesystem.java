class Solution {
    public List<String> removeSubfolders(String[] folder) {
         Set<String> folderSet = new HashSet<>(Arrays.asList(folder));
        List<String> result = new ArrayList<>();

        for (String currFolder : folder) {
            boolean isSubFolder = false;
            String tempFolder = currFolder;

            while (!currFolder.isEmpty()) {
                int position = currFolder.lastIndexOf('/');  
                if (position == -1) break;  

                currFolder = currFolder.substring(0, position);  

              
                if (folderSet.contains(currFolder)) {
                    isSubFolder = true; 
                    break;
                }
            }

            // If it's not a sub-folder, add it to the result list
            if (!isSubFolder) {
                result.add(tempFolder);
            }
        }

        return result;
    }
}

