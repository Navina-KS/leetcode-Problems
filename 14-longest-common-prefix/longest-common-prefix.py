class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        prefix= strs[0];
        for i in range(1, len(strs)):
            while not strs[i].startswith(prefix):
                prefix = prefix[0:len(prefix)-1]
        return prefix