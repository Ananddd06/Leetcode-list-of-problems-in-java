package codingPart;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProblemManager {
        private final List<Problem> allProblems;
        private final List<Problem> arraysAndHashProblems;
        private final List<Problem> slidingWindowProblems;
        private final List<Problem> stackProblems;
        private final List<Problem> binarySearchProblems;
        private final List<Problem> linkedListProblems;

        public ProblemManager() {

                allProblems = new ArrayList<>();
                arraysAndHashProblems = new ArrayList<>();
                slidingWindowProblems = new ArrayList<>();
                stackProblems = new ArrayList<>();
                binarySearchProblems = new ArrayList<>();
                linkedListProblems = new ArrayList<>();

                arraysAndHashProblems
                                .add(new Problem(1L, "Two Sum", "Arrays", "Easy",
                                                "https://leetcode.com/problems/two-sum/"));
                arraysAndHashProblems.add(
                                new Problem(4L, "Group Anagram", "Arrays", "Medium",
                                                "https://leetcode.com/problems/group-anagrams/"));
                arraysAndHashProblems.add(new Problem(5L, "Top K Frequent Elements", "Arrays", "Medium",
                                "https://leetcode.com/problems/top-k-frequent-elements/"));
                arraysAndHashProblems.add(new Problem(6L, "Encode and Decode String", "Arrays", "Medium",
                                "https://leetcode.com/problems/encode-and-decode-strings/"));
                arraysAndHashProblems.add(new Problem(7L, "Product of Array Except Self ", "Arrays", "Medium",
                                "https://leetcode.com/problems/product-of-array-except-self/"));

                slidingWindowProblems.add(new Problem(8L, "Longest Substring Without Repeating Characters",
                                "SlidingWindow",
                                "Medium",
                                "https://leetcode.com/problems/longest-substring-without-repeating-characters/"));
                slidingWindowProblems.add(new Problem(9L, "Permutation In String ", "SlidingWindow", "Medium",
                                "https://leetcode.com/problems/permutation-in-string/"));
                slidingWindowProblems.add(new Problem(10L, "Minimum Window Substring", "SlidingWindow", "Hard",
                                "https://leetcode.com/problems/minimum-window-substring/"));
                slidingWindowProblems.add(new Problem(11L, "Sliding Window Maximum", "SlidingWindow", "Hard",
                                "https://leetcode.com/problems/sliding-window-maximum/"));

                stackProblems.add(new Problem(12L, "Generate Parenthesis", "Stack", "Medium",
                                "https://leetcode.com/problems/generate-parentheses/"));
                stackProblems.add(new Problem(13L, "Daily Temperatures", "Stack", "Medium",
                                "https://leetcode.com/problems/daily-temperatures/"));
                stackProblems.add(new Problem(14L, "Largest Rectangle In Histogram", "Stack", "Hard",
                                "https://leetcode.com/problems/largest-rectangle-in-histogram/"));

                binarySearchProblems.add(new Problem(15L, "Search a 2D Matrix", "BinarySearch", "Medium",
                                "https://leetcode.com/problems/search-a-2d-matrix/"));
                binarySearchProblems.add(new Problem(16L, "Search In Rotated Sorted Array", "BinarySearch", "Medium",
                                "https://leetcode.com/problems/search-in-rotated-sorted-array/"));
                binarySearchProblems.add(new Problem(17L, "Median of Two Sorted Arrays", "BinarySearch", "Hard",
                                "https://leetcode.com/problems/median-of-two-sorted-arrays/"));

                linkedListProblems.add(new Problem(18L, "Reverse Linked List", "LinkedList", "Easy",
                                "https://leetcode.com/problems/reverse-linked-list/"));
                linkedListProblems.add(new Problem(19L, "Remove Nth Node From End of List", "LinkedList", "Medium",
                                "https://leetcode.com/problems/remove-nth-node-from-end-of-list/"));
                linkedListProblems.add(new Problem(20L, "Merge K Sorted Lists", "LinkedList", "Hard",
                                "https://leetcode.com/problems/merge-k-sorted-lists/"));

                allProblems.addAll(arraysAndHashProblems);
                allProblems.addAll(slidingWindowProblems);
                allProblems.addAll(stackProblems);
                allProblems.addAll(binarySearchProblems);
                allProblems.addAll(linkedListProblems);
        }

        public List<Problem> getAllProblems() {
                return new ArrayList<>(allProblems);
        }

        public List<Problem> getProblemsByCategory(String category) {
                switch (category.toLowerCase()) {
                        case "arrays":
                                return new ArrayList<>(arraysAndHashProblems);
                        case "slidingwindow":
                                return new ArrayList<>(slidingWindowProblems);
                        case "stack":
                                return new ArrayList<>(stackProblems);
                        case "binarysearch":
                                return new ArrayList<>(binarySearchProblems);
                        case "linkedlist":
                                return new ArrayList<>(linkedListProblems);
                        default:
                                return new ArrayList<>();
                }
        }

        public Problem getRandomProblem() {
                Random random = new Random();
                return allProblems.get(random.nextInt(allProblems.size()));
        }
}
