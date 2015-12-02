epsilon = 1
errors = 0
while epsilon > 0 and errors < 2 do
    for theta = 0, 2 * math.pi, 0.1 do
        diff = lsin(theta) / lcos(theta) - ltan(theta)
        if (math.abs(diff) > epsilon) then
	    print(epsilon, theta, diff)
	    errors = errors + 1
        end
    end
    epsilon = epsilon / 10
end
