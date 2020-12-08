s1,s2 = input().split()

def solution(s1,s2) :
    if(len(s1) != len(s2)):
        return "yes";
    s1 = sorted(s1);
    s2 = sorted(s2);
    
    if(s1 == s2):
        return "yes";
    return "no";


print(solution(s1,s2))
